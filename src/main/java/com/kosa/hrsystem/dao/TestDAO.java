package com.kosa.hrsystem.dao;

import com.kosa.hrsystem.dto.testDTO;
import com.kosa.hrsystem.utils.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDAO {

    public int test(testDTO dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int resultrow = 0;
        try {
            conn = ConnectionHelper.getConnection();
            String sql = "insert into mvcregister(id,pwd,email) values(?,?,?)";
            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, dto.getId());
            pstmt.setString(2, dto.getPwd());
            pstmt.setString(3, dto.getEmail());

            resultrow = pstmt.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            ConnectionHelper.close(pstmt);
            ConnectionHelper.close(conn);
        }
        return resultrow;
    }
}
