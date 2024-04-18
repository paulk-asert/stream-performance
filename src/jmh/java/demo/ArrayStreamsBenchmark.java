/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package demo;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class ArrayStreamsBenchmark {
    private static final int[] five = {10, 20, 15, 30, 5};
    private static final int[] ninety = {
        10, 20, 15, 30, 5,
        -10, -20, -15, -30, -5,
        210, 220, 215, 230, 25,
        -210, -220, -215, -230, -25,
        110, 120, 115, 130, 15,
        -110, -120, -115, -130, -15,
        10, 20, 15, 30, 5,
        -10, -20, -15, -30, -5,
        210, 220, 215, 230, 25,
        -210, -220, -215, -230, -25,
        110, 120, 115, 130, 15,
        -110, -120, -115, -130, -15,
        10, 20, 15, 30, 5,
        -10, -20, -15, -30, -5,
        210, 220, 215, 230, 25,
        -210, -220, -215, -230, -25,
        110, 120, 115, 130, 15,
        -110, -120, -115, -130, -15
    };

    @Benchmark
    public void groovyArrayMaxFive(Blackhole bh) {
        bh.consume(ArrayMax.max(five));
    }

    @Benchmark
    public void groovyArrayMaxAbsFive(Blackhole bh) {
        bh.consume(ArrayMax.maxAbs(five));
    }

    @Benchmark
    public void groovyArrayMaxNinety(Blackhole bh) {
        bh.consume(ArrayMax.max(ninety));
    }

    @Benchmark
    public void groovyArrayMaxAbsNinety(Blackhole bh) {
        bh.consume(ArrayMax.maxAbs(ninety));
    }

//    @Benchmark
//    public void arrayMaxAbs2(Blackhole bh) {
//        bh.consume(ArrayMax.maxAbs2(numbers));
//    }

//    @Benchmark
//    public void arrayMaxAbs3(Blackhole bh) {
//        bh.consume(ArrayMax.maxAbs3(numbers));
//    }

//    @Benchmark
//    public void arrayMaxAbs2(Blackhole bh) {
//        bh.consume(ArrayMax.maxAbs2(numbers));
//    }

    @Benchmark
    public void groovyStreamsMaxFive(Blackhole bh) {
        bh.consume(StreamsMax.max(five));
    }

    @Benchmark
    public void groovyStreamsMaxAbsFive(Blackhole bh) {
        bh.consume(StreamsMax.maxAbs(five));
    }

    @Benchmark
    public void groovyStreamsMaxNinety(Blackhole bh) {
        bh.consume(StreamsMax.max(ninety));
    }

    @Benchmark
    public void groovyStreamsMaxAbsNinety(Blackhole bh) {
        bh.consume(StreamsMax.maxAbs(ninety));
    }

//    @Benchmark
//    public void streamsMaxAbs2(Blackhole bh) {
//        bh.consume(StreamsMax.maxAbs2(numbers));
//    }

//    @Benchmark
//    public void streamsMaxAbs3(Blackhole bh) {
//        bh.consume(StreamsMax.maxAbs3(numbers));
//    }

    @Benchmark
    public void javaStreamsMaxFive(Blackhole bh) {
        bh.consume(JavaStreamsMax.max(five));
    }

    @Benchmark
    public void javaStreamsMaxNinety(Blackhole bh) {
        bh.consume(JavaStreamsMax.max(ninety));
    }

    @Benchmark
    public void javaStreamsMaxAbsFive(Blackhole bh) {
        bh.consume(JavaStreamsMax.maxAbs(five));
    }

    @Benchmark
    public void javaStreamsMaxAbsNinety(Blackhole bh) {
        bh.consume(JavaStreamsMax.maxAbs(ninety));
    }

}
