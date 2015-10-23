public int maxBlock(String str) {
  int blockLength = 1;
  if(str.length() == 0)
  {
  blockLength = 0;
  }
      for(int i = 0; i < str.length()-1; i++){
      if(i < str.length()-2 && str.charAt(i) == str.charAt(i+1) )
      {
      blockLength++;
      }
      else
      {
      blockLength=1;
      }
      }
      return blockLength
      }
     