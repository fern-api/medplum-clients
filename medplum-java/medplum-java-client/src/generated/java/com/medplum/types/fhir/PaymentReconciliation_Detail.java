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
    as = ImmutablePaymentReconciliation_Detail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PaymentReconciliation_Detail {
  Optional<Reference> request();

  CodeableConcept type();

  Optional<Reference> submitter();

  Optional<Reference> payee();

  Optional<List<Extension>> modifierExtension();

  Optional<Date> date();

  Optional<List<Extension>> extension();

  Optional<Reference> response();

  Optional<Identifier> identifier();

  Optional<Money> amount();

  Optional<Identifier> predecessor();

  Optional<Reference> responsible();

  Optional<String> id();

  static ImmutablePaymentReconciliation_Detail.TypeBuildStage builder() {
    return ImmutablePaymentReconciliation_Detail.builder();
  }
}
