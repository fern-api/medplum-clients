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
  Optional<Money> amount();

  Optional<Reference> submitter();

  Optional<Reference> responsible();

  Optional<Identifier> predecessor();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> request();

  CodeableConcept type();

  Optional<Date> date();

  Optional<List<Extension>> extension();

  Optional<Identifier> identifier();

  Optional<Reference> payee();

  Optional<String> id();

  Optional<Reference> response();

  static ImmutablePaymentReconciliation_Detail.TypeBuildStage builder() {
    return ImmutablePaymentReconciliation_Detail.builder();
  }
}
