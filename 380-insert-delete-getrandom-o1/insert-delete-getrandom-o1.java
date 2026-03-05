class RandomizedSet {

    List<Integer> list = new ArrayList<>();
    HashMap<Integer,Integer> map = new HashMap<>();
    Random rand = new Random();

    public RandomizedSet() {}

    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;

        list.add(val);
        map.put(val, list.size()-1);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;

        int i = map.get(val);
        int last = list.get(list.size()-1);

        list.set(i, last);
        map.put(last, i);

        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}