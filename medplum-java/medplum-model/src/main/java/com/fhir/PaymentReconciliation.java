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
    as = ImmutablePaymentReconciliation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PaymentReconciliation {
  Optional<List<PaymentReconciliation_Detail>> detail();

  Money paymentAmount();

  Optional<uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<id> id();

  Optional<String> disposition();

  Optional<Identifier> paymentIdentifier();

  Optional<Narrative> text();

  Optional<Reference> requestor();

  Optional<CodeableConcept> formCode();

  Optional<Reference> request();

  Optional<code> language();

  Optional<List<Extension>> extension();

  Optional<Reference> paymentIssuer();

  Optional<List<PaymentReconciliation_ProcessNote>> processNote();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<code> status();

  Optional<PaymentreconciliationOutcome> outcome();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> period();

  Optional<date> paymentDate();

  String resourceType();

  Optional<dateTime> created();

  static ImmutablePaymentReconciliation.PaymentAmountBuildStage builder() {
    return ImmutablePaymentReconciliation.builder();
  }
}
