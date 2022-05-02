package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutablePaymentReconciliation_ProcessNote.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PaymentReconciliation_ProcessNote {
  Optional<String> text();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Paymentreconciliation_processnoteType> type();

  Optional<List<Extension>> extension();

  static ImmutablePaymentReconciliation_ProcessNote.Builder builder() {
    return ImmutablePaymentReconciliation_ProcessNote.builder();
  }
}
