package com.richard.feature.java8.io;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;

/**
 * @Description TODO
 * @Author Richard
 * @Date 2019/10/19 10:09
 **/
public class FileOperation {

    public static void main(String[] args) {
        /**
         *
         * BufferedReader.line(): 返回文本行的流 Stream<String>
         *
         * Files.lines(Path, Charset):返回文本行的流 Stream<String>
         *
         * Files.list(Path): 遍历当前目录下的文件和目录
         *
         * Files.walk(Path, int, FileVisitOption): 遍历某一个目录下的所有文件和指定深度的子目录
         *
         * Files.find(Path, int, BiPredicate, FileVisitOption... ): 查找相应的文件
         *
         **/
    }
}
