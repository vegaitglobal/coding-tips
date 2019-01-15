package com.codingtips;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 4, batchSize = 100)
@Measurement(iterations = 8, batchSize = 200)
@Fork(6)
public class Concatenation {

    private final String[] letters = "Vega IT Sourcing".split("(?!^)");

    @Benchmark
    public String concatenate() {
        String result = "";
        for (String letter : letters) {
            result += letter;
        }
        return result;
    }

    @Benchmark
    public String concatenateWithStringBuilder() {
        StringBuilder builder = new StringBuilder();
        for (String letter : letters) {
            builder.append(letter);
        }
        return builder.toString();
    }

}
