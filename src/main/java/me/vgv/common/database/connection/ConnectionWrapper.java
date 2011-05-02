package me.vgv.common.database.connection;

import com.google.common.base.Preconditions;

import java.sql.*;
import java.util.Map;
import java.util.Properties;

/**
 * Простой wrapper, который транслирует абсолютно все вызовы
 * низлежащему connection'у
 *
 * @author Vasily Vasilkov (vgv@vgv.me)
 */
public class ConnectionWrapper implements Connection {

	private final Connection peer;

	public ConnectionWrapper(Connection peer) {
		Preconditions.checkNotNull(peer, "peer is null - error");

		this.peer = peer;
	}

	public Connection getUnderlyingConnection() {
		return peer;
	}

	@Override
	public Statement createStatement() throws SQLException {
		return peer.createStatement();
	}

	@Override
	public PreparedStatement prepareStatement(String sql) throws SQLException {
		return peer.prepareStatement(sql);
	}

	@Override
	public CallableStatement prepareCall(String sql) throws SQLException {
		return peer.prepareCall(sql);
	}

	@Override
	public String nativeSQL(String sql) throws SQLException {
		return peer.nativeSQL(sql);
	}

	@Override
	public void setAutoCommit(boolean autoCommit) throws SQLException {
		peer.setAutoCommit(autoCommit);
	}

	@Override
	public boolean getAutoCommit() throws SQLException {
		return peer.getAutoCommit();
	}

	@Override
	public void commit() throws SQLException {
		peer.commit();
	}

	@Override
	public void rollback() throws SQLException {
		peer.rollback();
	}

	@Override
	public void close() throws SQLException {
		peer.close();
	}

	@Override
	public boolean isClosed() throws SQLException {
		return peer.isClosed();
	}

	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		return peer.getMetaData();
	}

	@Override
	public void setReadOnly(boolean readOnly) throws SQLException {
		peer.setReadOnly(readOnly);
	}

	@Override
	public boolean isReadOnly() throws SQLException {
		return peer.isReadOnly();
	}

	@Override
	public void setCatalog(String catalog) throws SQLException {
		peer.setCatalog(catalog);
	}

	@Override
	public String getCatalog() throws SQLException {
		return peer.getCatalog();
	}

	@Override
	public void setTransactionIsolation(int level) throws SQLException {
		peer.setTransactionIsolation(level);
	}

	@Override
	public int getTransactionIsolation() throws SQLException {
		return peer.getTransactionIsolation();
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		return peer.getWarnings();
	}

	@Override
	public void clearWarnings() throws SQLException {
		peer.clearWarnings();
	}

	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
		return peer.createStatement(resultSetType, resultSetConcurrency);
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		return peer.prepareStatement(sql, resultSetType, resultSetConcurrency);
	}

	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		return peer.prepareCall(sql, resultSetType, resultSetConcurrency);
	}

	@Override
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		return peer.getTypeMap();
	}

	@Override
	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
		peer.setTypeMap(map);
	}

	@Override
	public void setHoldability(int holdability) throws SQLException {
		peer.setHoldability(holdability);
	}

	@Override
	public int getHoldability() throws SQLException {
		return peer.getHoldability();
	}

	@Override
	public Savepoint setSavepoint() throws SQLException {
		return peer.setSavepoint();
	}

	@Override
	public Savepoint setSavepoint(String name) throws SQLException {
		return peer.setSavepoint(name);
	}

	@Override
	public void rollback(Savepoint savepoint) throws SQLException {
		peer.rollback(savepoint);
	}

	@Override
	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
		peer.releaseSavepoint(savepoint);
	}

	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		return peer.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		return peer.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		return peer.prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
		return peer.prepareStatement(sql, autoGeneratedKeys);
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
		return peer.prepareStatement(sql, columnIndexes);
	}

	@Override
	public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
		return peer.prepareStatement(sql, columnNames);
	}

	@Override
	public Clob createClob() throws SQLException {
		return peer.createClob();
	}

	@Override
	public Blob createBlob() throws SQLException {
		return peer.createBlob();
	}

	@Override
	public NClob createNClob() throws SQLException {
		return peer.createNClob();
	}

	@Override
	public SQLXML createSQLXML() throws SQLException {
		return peer.createSQLXML();
	}

	@Override
	public boolean isValid(int timeout) throws SQLException {
		return peer.isValid(timeout);
	}

	@Override
	public void setClientInfo(String name, String value) throws SQLClientInfoException {
		peer.setClientInfo(name, value);
	}

	@Override
	public void setClientInfo(Properties properties) throws SQLClientInfoException {
		peer.setClientInfo(properties);
	}

	@Override
	public String getClientInfo(String name) throws SQLException {
		return peer.getClientInfo(name);
	}

	@Override
	public Properties getClientInfo() throws SQLException {
		return peer.getClientInfo();
	}

	@Override
	public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
		return peer.createArrayOf(typeName, elements);
	}

	@Override
	public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
		return peer.createStruct(typeName, attributes);
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return peer.unwrap(iface);
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return peer.isWrapperFor(iface);
	}
}
