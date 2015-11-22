/*
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
package com.github.vbauer.yta.service.basic

import spock.lang.Specification

/**
 * @author Vladislav Bauer
 */

class ApiStatusTest extends Specification {

    def "API response statuses"() {
        expect:
            value == code

        where:
            value | code
            200   | ApiStatus.ERR_OK
            401   | ApiStatus.ERR_KEY_INVALID
            402   | ApiStatus.ERR_KEY_BLOCKED
            403   | ApiStatus.ERR_DAILY_REQ_LIMIT_EXCEEDED
            404   | ApiStatus.ERR_DAILY_CHAR_LIMIT_EXCEEDED
            413   | ApiStatus.ERR_TEXT_TOO_LONG
            422   | ApiStatus.ERR_UNPROCESSABLE_TEXT
            501   | ApiStatus.ERR_LANG_NOT_SUPPORTED
    }

}