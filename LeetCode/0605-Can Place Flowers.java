class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int nums = 0;
        if(flowerbed.length == 1){
            if(flowerbed[0] == 1){
                return 0 >= n;
            }else{
                return 1 >= n;
            }
        }
        if(flowerbed[1] == 0 && flowerbed[0] == 0){
            nums++;
            flowerbed[0] = 1;
        }
        for(int i = 1; i < flowerbed.length - 1;i++){
            if(flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && flowerbed[i] == 0){
                nums++;
                flowerbed[i] = 1;
            }
        }
        if(flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0){
            nums++;
            flowerbed[flowerbed.length - 1] = 1;
        }
        return nums >= n;
    }
}