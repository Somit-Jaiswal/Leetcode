class Solution {
public String sortVowels(String s) {
StringBuilder sb = new StringBuilder("");

    ArrayList<Character> list = new ArrayList<>();
    int len = s.length();

    for(int i=0; i<len ; i++){
        char ch = s.charAt(i);
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
            ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            list.add(ch);
        }
    }

    Collections.sort(list);
    int idx=0;
    for(int i=0; i<len; i++){
        char ch = s.charAt(i);
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || 
            ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            sb.append(list.get(idx++));
        } else{
            sb.append(ch);
        }
    }

    return sb.toString();
}
}