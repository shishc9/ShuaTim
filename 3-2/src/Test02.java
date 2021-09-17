import java.util.*;

/**
 * @date:2021/4/6, 15:43
 * @author:ShiShc
 */

class MyPriorityQueue<E> extends AbstractQueue<E> {

    private static final int DEFAULT_INITIAL_CAPACITY = 11;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    Object[] queue;

    /**
     * The number of elements in the priority queue.
     */
    private int size = 0;

    /**
     * The comparator, or null if priority queue uses elements' natural ordering.
     */
    private final Comparator<? super E> comparator;

    int modCount = 0;

    public MyPriorityQueue() {
        this(DEFAULT_INITIAL_CAPACITY, null);
    }

    public MyPriorityQueue(Comparator<? super E> comparator) {this(DEFAULT_INITIAL_CAPACITY, comparator);}

    public MyPriorityQueue(int initialCapacity, Comparator<? super E> comparator) {
        if(initialCapacity < 1) {
            throw new IllegalArgumentException();
        }
        this.queue = new Object[initialCapacity];
        this.comparator = comparator;
    }

    private void grow(int minCapacity) {
        int oldCapacity = queue.length;

        // Double size if small; else grow by 50%
        int newCapacity = oldCapacity + ((oldCapacity < 64) ?
                                        (oldCapacity + 2) :
                                        (oldCapacity >> 1));

        if(newCapacity - MAX_ARRAY_SIZE > 0) {
            newCapacity = hugeCapacity(minCapacity);
        }
        queue = Arrays.copyOf(queue, newCapacity);
    }

    private static int hugeCapacity(int minCapacity) {
        if(minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        return (minCapacity > MAX_ARRAY_SIZE) ? Integer.MAX_VALUE : MAX_ARRAY_SIZE;
    }

    public boolean insert(E e) {return offer(e);}

    @Override
    public boolean offer(E e) {
        if(e == null) {
            throw new NullPointerException();
        }
        modCount++;
        int i = size;
        if(i >= queue.length) {
            grow(i + 1);
        }
        size = i + 1;
        if(i == 0) {
            queue[0] = e;
        } else {
            siftUp(i, e);
        }

        return true;
    }

    @Override
    public E poll() {
        if(size == 0) {
            return null;
        }
        int s = --size;
        modCount++;
        E result = (E) queue[0];
        E x = (E) queue[s];
        if(s != 0) {
            siftDown(0, x);
        }
        return result;
    }

    @Override
    public E peek() {
        return (size == 0) ? null : (E) queue[0];
    }

    public int indexOf(Object o) {
        if(o != null) {
            for(int i = 0;i < size;i ++) {
                if(o.equals(queue[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public E get(int index) {
        return (E)queue[index];
    }

    public boolean increaseKey(Integer x, Integer k) {
        int index = indexOf(x);
        if(index != -1) {
            queue[index] = (Integer)queue[index] + k;
            heapify();
            return true;
        } else {
            return false;
        }
    }

    private void heapify() {
        for(int i = (size >>> 1) - 1; i >= 0; i--) {
            siftDown(i, (E)queue[i]);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    private void siftUp(int k, E x) {
        if(comparator != null) {
            siftUpUsingComparator(k, x);
        } else {
            siftUpComparable(k, x);
        }
    }

    private void siftUpComparable(int k, E x) {
        Comparable<? super E> key = (Comparable<? super E>) x;
        while(k > 0) {
            int parent = (k-1) >>> 1;
            Object e = queue[parent];
            if(key.compareTo((E) e) >= 0) {
                break;
            }
            queue[k] = e;
            k = parent;
        }

        queue[k] = key;
    }

    private void siftUpUsingComparator(int k, E x) {
        while(k > 0) {
            int parent = (k - 1) >>> 1;
            Object e = queue[parent];
            if(comparator.compare(x, (E) e) >= 0) {
                break;
            }
            queue[k] = e;
            k = parent;
        }

        queue[k] = x;
    }

    private void siftDown(int k, E x) {
        if(comparator != null) {
            siftDownUsingComparator(k, x);
        } else {
            siftDownComparable(k ,x);
        }
    }

    private void siftDownComparable(int k, E x) {
        Comparable<? super E> key = (Comparable<? super E>) x;
        int half = size >>> 1;
        while(k < half) {
            int child = (k << 1) + 1;
            Object c = queue[child];
            int right = child + 1;
            if(right < size && ((Comparable<? super E>) c).compareTo((E) queue[right]) > 0) {
                c = queue[child = right];
            }
            if(key.compareTo((E) c) <= 0) {
                break;
            }
            queue[k] = c;
            k = child;
        }
        queue[k] = key;
    }

    private void siftDownUsingComparator(int k, E x) {
        int half = size >>> 1;
        while (k < half) {
            int child = (k << 1) + 1;
            Object c = queue[child];
            int right = child + 1;
            if (right < size &&
                    comparator.compare((E) c, (E) queue[right]) > 0) {
                c = queue[child = right];
            }
            if (comparator.compare(x, (E) c) <= 0) {
                break;
            }
            queue[k] = c;
            k = child;
        }
        queue[k] = x;
    }
}


public class Test02 {
    public static void main(String[] args) {
        MyPriorityQueue<Integer> minHeap = new MyPriorityQueue<>();
        MyPriorityQueue<Integer> maxHeap = new MyPriorityQueue<>((x, y) -> (y - x));
        maxHeap.add(4);
        maxHeap.add(6);
        maxHeap.add(3);
        System.out.println("4,6,3 - the max : " + maxHeap.peek());
        System.out.println("4,6,3 - the size : " + maxHeap.size());
        maxHeap.add(9);
        System.out.println("4,6,3,9(poll) - the max : " + maxHeap.poll());
        System.out.println("4,6,3 - the max : " + maxHeap.peek());
        maxHeap.increaseKey(4, 3);
        System.out.println("7,6,3 - the max : " + maxHeap.peek());
    }
}
