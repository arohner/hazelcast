/*
 * Copyright (c) 2007-2008, Hazel Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.hazelcast.impl;


public class CallContext {
    TransactionImpl txn = null;
    final int threadId;
    final boolean client;

    public CallContext(int threadId, boolean client) {
        this.threadId = threadId;
        this.client = client;
    }

    public TransactionImpl getTxn() {
        return txn;
    }

    public void setTxn(TransactionImpl txn) {
        this.txn = txn;
    }

    public void setTransaction(TransactionImpl txn) {
        this.txn = txn;

    }

    public void finalizeTxn() {
        txn = null;
    }

    public long getTxnId() {
        return (txn == null) ? -1L : txn.getId();
    }

    public int getThreadId() {
        return threadId;
    }

    public boolean isClient() {
        return client;
    }
}