package com.upc.techelp.platform.iam.infrastructure.hashing.bcrypt;
import com.upc.techelp.platform.iam.application.internal.outboundservices.hashing.HashingService;
import org.springframework.security.crypto.password.PasswordEncoder;

public interface BCryptHashingService extends HashingService, PasswordEncoder {

}
