/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\CKWork\\test\\GreenDamExplorer\\app\\src\\main\\aidl\\com\\cmcm\\greendamexplorer\\core\\engine\\service\\delete\\IDeleteFilesCallback.aidl
 */
package com.cmcm.greendamexplorer.core.engine.service.delete;
public interface IDeleteFilesCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.cmcm.greendamexplorer.core.engine.service.delete.IDeleteFilesCallback
{
private static final java.lang.String DESCRIPTOR = "com.cmcm.greendamexplorer.core.engine.service.delete.IDeleteFilesCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.cmcm.greendamexplorer.core.engine.service.delete.IDeleteFilesCallback interface,
 * generating a proxy if needed.
 */
public static com.cmcm.greendamexplorer.core.engine.service.delete.IDeleteFilesCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.cmcm.greendamexplorer.core.engine.service.delete.IDeleteFilesCallback))) {
return ((com.cmcm.greendamexplorer.core.engine.service.delete.IDeleteFilesCallback)iin);
}
return new com.cmcm.greendamexplorer.core.engine.service.delete.IDeleteFilesCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onStart:
{
data.enforceInterface(DESCRIPTOR);
this.onStart();
reply.writeNoException();
return true;
}
case TRANSACTION_onPause:
{
data.enforceInterface(DESCRIPTOR);
this.onPause();
reply.writeNoException();
return true;
}
case TRANSACTION_postUpdate:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
long _arg2;
_arg2 = data.readLong();
int _arg3;
_arg3 = data.readInt();
this.postUpdate(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_onCancel:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.onCancel(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onFinish:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.onFinish(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onResume:
{
data.enforceInterface(DESCRIPTOR);
this.onResume();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.cmcm.greendamexplorer.core.engine.service.delete.IDeleteFilesCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void onStart() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onStart, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onPause() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onPause, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void postUpdate(java.lang.String fileName, long allSize, long hasDelete, int progress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(fileName);
_data.writeLong(allSize);
_data.writeLong(hasDelete);
_data.writeInt(progress);
mRemote.transact(Stub.TRANSACTION_postUpdate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onCancel(long hasDeletedSize) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(hasDeletedSize);
mRemote.transact(Stub.TRANSACTION_onCancel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onFinish(long hasDeletedSize) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(hasDeletedSize);
mRemote.transact(Stub.TRANSACTION_onFinish, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onResume() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onResume, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onStart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onPause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_postUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onCancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onFinish = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onResume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public void onStart() throws android.os.RemoteException;
public void onPause() throws android.os.RemoteException;
public void postUpdate(java.lang.String fileName, long allSize, long hasDelete, int progress) throws android.os.RemoteException;
public void onCancel(long hasDeletedSize) throws android.os.RemoteException;
public void onFinish(long hasDeletedSize) throws android.os.RemoteException;
public void onResume() throws android.os.RemoteException;
}
