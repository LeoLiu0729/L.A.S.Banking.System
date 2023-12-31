package com.csc340.jpacruddemo.LoanApplication;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
    boolean existsByApplicantIdAndStatusNot(Long applicantId, String status);

}
