CREATE UNIQUE NONCLUSTERED INDEX idx_mfa_unique_name on mfa_providers (identity_zone_id, name);