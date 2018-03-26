class Solution {
  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
      if(image[sr][sc] == newColor)
          return image;
      change(image, sr, sc, image[sr][sc], newColor);
      return image;
  }

  public void change(int[][] image,int x,int y,int oldColor,int newColor){
      if(x < image.length && y < image[0].length && x >= 0 && y >= 0){
          if(image[x][y] == oldColor){
              image[x][y] = newColor;
              change(image, x + 1, y, oldColor, newColor);
              change(image, x - 1, y, oldColor, newColor);
              change(image, x , y + 1, oldColor, newColor);
              change(image, x , y - 1, oldColor, newColor);
          }
      }
  }
}