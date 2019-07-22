package com.hack.self;

import java.util.*;


/**
 * 
 * @author Sanjar
 * 
 * Minimum Swaps
Swapnil has a matrix of integers and wants to find the minimum number of swaps required to bring the largest element to the center of the matrix. Swaps can be made with horizontally and vertically adjacent elements only.

For a matrix m x n, where m is the number of rows and n the number of columns. For even values of both m and n, there are 4 centers.

He can do it with small matrices but for large ones, he’s lost. Help him solve this problem.

Input Format
The first line contains an integer t denoting the number of test cases. The first line of each test case contains two integers separated by space m and n denoting the number of rows and the number of columns in the matrix respectively. The following m lines describe the matrix. Each line consists of n integers, each i.

Output Format
For each test case, output the minimum number of swaps required. If there are several largest integers, output the minimum required to get any one of them to any one of the center positions.

Sample Input
7
3 3
1 2 3
4 5 6
7 8 9
4 3
9 7 7
4 2 8
9 6 6
8 3 2
1 6
1 5 2 3 4 5
6 1
3
2
1
1
2
3
2 2
1 1
1 1
1 7
2 3 1 2 1 2 3
1 1
2
Sample Output
2
1
1
2
0
2
0
Constraints
1 <= t <= 1000

1 <= m,n <= 500

1 <= i <= 105 



Sample input 2 :
19
3 3
1 2 3
4 5 6
7 8 9
4 3
9 7 7
4 2 8
9 6 6
8 3 2
1 6
1 5 2 3 4 5
1 1
100
6 1
3
2
1
1
2
3
2 2
1 1
1 1
1 7
2 3 1 2 1 2 3
1 6
19 6 3 1 4 19
4 4
1 1 1 1
1 2 2 1
1 2 2 1
1 1 1 1
4 4
2 2 2 2
2 1 1 2
2 1 1 2
2 2 2 2
4 4
2 1 1 2
1 1 1 1
1 1 1 1
2 1 1 2
5 9
86 42 68 43 59 68 52 33 20
42 20 85 33 33 85 86 33 85
59 52 68 20 42 52 80 68 52
42 43 85 68 80 85 80 43 52
43 42 20 80 33 86 85 68 33
10 8
75 80 55 78 83 53 35 92
96 39 20 40 81 20 64 56
38 45 97 46 23 82 96 22
50 54 83 89 66 54 24 26
75 25 28 79 24 62 88 93
94 95 59 85 70 99 22 16
97 21 52 30 62 74 45 82
54 39 82 92 48 31 29 49
56 24 11 54 77 79 10 37
99 31 14 99 90 18 32 24
9 7
67 41 90 25 92 41 42
65 24 51 58 73 87 74
96 14 40 93 97 12 33
71 60 67 20 89 39 62
78 97 63 88 82 92 87
26 15 73 61 46 28 74
20 40 22 54 29 73 98
34 76 60 41 70 98 89
56 95 34 48 10 80 13
11 10
850 619 786 902 776 191 147 676 414 905
604 409 288 272 746 913 891 989 282 871
879 315 154 497 180 410 761 433 971 725
550 220 578 784 143 874 491 340 641 339
609 940 506 711 809 348 683 845 241 889
942 244 736 541 169 964 544 378 907 534
526 200 742 978 995 680 170 823 328 263
737 716 635 312 793 274 165 463 515 120
778 796 806 376 993 468 594 262 509 480
535 105 621 359 803 326 298 777 872 877
795 879 919 597 261 523 429 598 677 893
9 10
184 236 739 342 368 963 108 146 983 435
946 357 153 446 433 133 189 796 438 852
243 196 287 298 491 286 688 704 608 377
609 397 718 631 912 559 785 655 250 120
102 688 761 115 700 804 888 787 704 948
488 666 340 960 347 940 904 200 902 457
794 632 708 493 628 439 680 846 539 306
947 456 288 783 594 907 757 290 279 124
394 517 323 436 930 456 828 616 803 175
9 12
581 350 778 286 586 229 265 368 406 700 605 777
881 517 489 449 802 276 321 900 789 303 264 274
831 955 774 750 744 726 744 489 451 404 874 188
962 768 503 617 527 174 658 167 457 549 382 651
758 112 344 389 533 502 758 758 913 240 526 110
640 813 579 516 978 968 731 396 503 967 283 562
918 855 755 126 754 599 104 146 148 994 416 567
173 385 733 281 537 446 752 569 105 828 147 508
426 974 196 348 939 699 624 680 125 529 995 394
10 13
140 370 871 916 967 531 369 704 315 346 685 789 561
748 897 335 243 799 732 144 504 596 654 299 542 147
869 548 655 482 923 117 767 932 746 725 720 912 924
633 349 313 919 396 305 369 926 168 882 725 186 923
641 167 995 323 179 221 117 232 955 399 350 584 614
261 282 453 827 653 472 721 243 570 725 972 345 803
378 125 217 261 105 129 794 957 559 819 249 560 364
201 712 218 275 875 342 547 898 420 296 798 746 650
420 332 895 230 633 210 228 248 414 699 734 197 952
165 164 319 623 723 117 515 451 672 120 907 712 547
10 11
312 968 305 468 265 286 835 170 313 715 650
574 781 122 523 890 182 817 933 940 529 732
100 514 356 511 781 740 125 618 379 482 403
439 117 660 720 599 280 946 159 711 663 462
990 969 473 472 281 604 153 966 841 458 937
732 171 299 316 963 823 484 423 704 686 640
419 772 670 315 467 821 577 661 842 814 396
482 147 961 903 642 440 763 220 703 962 313
824 268 586 214 497 731 140 861 299 970 386
179 658 716 988 968 722 933 733 368 250 446


Sample output 2:

2
1
1
0
2
0
2
2
0
1
2
3
1
5
1
7
8
4
5


 *
 */
class solution {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int tc = scanner.nextInt();
		for(int i = 0 ; i< tc ; i++) {
			int rows = scanner.nextInt();
			int columns = scanner.nextInt();
			scanner.nextLine();
			int max = 0;
			
			List<int[]> c = new ArrayList<>();
			for(int j= 0 ; j<rows; j++) {
				for(int k = 0 ; k < columns; k++) {
					int v = scanner.nextInt();
					if(v>=max) {
						if(v>max) {
							max = v;
							c.clear();
						}
						ml(c, j, k);
					}					
				}
			}
			
			int fs = 0;
			boolean b = true;
			for(int[] a : c) {
				int lr,lc = 0;
				lr = calcMin(rows, a[0]);
				lc = calcMin(columns, a[1]);
				if(b) {
					fs = lr+lc;
					b = false;
				}
				
				
				if( lr+lc < fs) {
					fs = lr+lc;
				}
				
			}
			System.out.println(fs);
		}
		scanner.close();
	}
	private static void ml(List<int[]> c, int j, int k) {
		int[] p = new int[2];
		p[0] = j;
		p[1] = k;
		c.add(p);
	}
	static int calcMin(int v1, int v2 ){
		if(v1%2 == 0) {
			int x = Math.abs(v2 - ((v1/2)));
			int y = Math.abs(v2 - ((v1/2)-1));
			return x >y? y:x;
		}
		else {
			return Math.abs(v2 - ((v1/2)));
		}
		
	}
}