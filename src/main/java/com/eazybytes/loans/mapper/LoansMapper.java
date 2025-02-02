package com.eazybytes.loans.mapper;

import com.eazybytes.loans.dto.LoansDto;
import com.eazybytes.loans.entity.Loans;
import org.springframework.stereotype.Component;

@Component
public class LoansMapper extends AbstractMapper<Loans, LoansDto> {
    @Override
    public LoansDto toDto(Loans entity) {
        return LoansDto.builder()
                .mobileNumber(entity.getMobileNumber())
                .loanNumber(entity.getLoanNumber())
                .loanType(entity.getLoanType())
                .totalLoan(entity.getTotalLoan())
                .amountPaid(entity.getAmountPaid())
                .outstandingAmount(entity.getOutstandingAmount())
                .build();
    }

    @Override
    public Loans toEntity(LoansDto dto) {
        Loans loans = new Loans();
        loans.setLoanNumber(dto.getLoanNumber());
        loans.setLoanType(dto.getLoanType());
        loans.setMobileNumber(dto.getMobileNumber());
        loans.setTotalLoan(dto.getTotalLoan());
        loans.setAmountPaid(dto.getAmountPaid());
        loans.setOutstandingAmount(dto.getOutstandingAmount());
        return loans;
    }

    @Override
    public Loans toEntity(LoansDto dto, Loans loans) {
        loans.setLoanNumber(dto.getLoanNumber());
        loans.setLoanType(dto.getLoanType());
        loans.setMobileNumber(dto.getMobileNumber());
        loans.setTotalLoan(dto.getTotalLoan());
        loans.setAmountPaid(dto.getAmountPaid());
        loans.setOutstandingAmount(dto.getOutstandingAmount());
        return loans;
    }
}
