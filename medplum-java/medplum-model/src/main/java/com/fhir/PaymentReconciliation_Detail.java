package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Identifier> predecessor();

  Optional<Identifier> identifier();

  CodeableConcept type();

  Optional<Reference> response();

  Optional<date> date();

  Optional<Money> amount();

  Optional<String> id();

  Optional<Reference> submitter();

  Optional<Reference> payee();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> responsible();

  Optional<Reference> request();

  Optional<List<Extension>> extension();

  static ImmutablePaymentReconciliation_Detail.TypeBuildStage builder() {
    return ImmutablePaymentReconciliation_Detail.builder();
  }
}
