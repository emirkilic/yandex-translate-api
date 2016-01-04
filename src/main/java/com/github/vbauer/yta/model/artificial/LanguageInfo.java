/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Vladislav Bauer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.vbauer.yta.model.artificial;

import com.github.vbauer.yta.model.Language;
import com.github.vbauer.yta.model.basic.HasCode;
import org.immutables.gson.Gson.TypeAdapters;
import org.immutables.value.Value.Immutable;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.ThreadSafe;
import java.util.Optional;

/**
 * Model-interface with information about language.
 *
 * @author Vladislav Bauer
 */

@Immutable
@TypeAdapters
public interface LanguageInfo extends HasCode<Integer> {

    /**
     * Language code/identifier.
     *
     * @return language
     */
    Optional<String> lang();


    /**
     * Utility class to work with {@link LanguageInfo}.
     *
     * @author Vladislav Bauer
     */
    @ThreadSafe
    final class LanguageInfoUtils {

        private LanguageInfoUtils() {
            throw new UnsupportedOperationException();
        }


        @Nonnull
        public static Optional<Language> convert(final LanguageInfo languageInfo) {
            return languageInfo.lang().map(Language::of);
        }

    }

}
