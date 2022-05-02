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
  CodeableConcept type();

  Optional<List<Extension>> extension();

  Optional<Identifier> predecessor();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> submitter();

  Optional<Identifier> identifier();

  Optional<Reference> request();

  Optional<Date> date();

  Optional<Money> amount();

  Optional<Reference> response();

  Optional<Reference> responsible();

  Optional<Reference> payee();

  Optional<String> id();

  static ImmutablePaymentReconciliation_Detail.TypeBuildStage builder() {
    return ImmutablePaymentReconciliation_Detail.builder();
  }
}
