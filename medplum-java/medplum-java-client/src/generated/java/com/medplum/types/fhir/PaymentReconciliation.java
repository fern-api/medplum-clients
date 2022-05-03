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
    as = ImmutablePaymentReconciliation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PaymentReconciliation {
  Optional<CodeableConcept> formCode();

  Optional<Uri> implicitRules();

  Optional<DateTime> created();

  Optional<List<PaymentReconciliation_ProcessNote>> processNote();

  Optional<List<ResourceList>> contained();

  Optional<PaymentreconciliationOutcome> outcome();

  Optional<Reference> request();

  Money paymentAmount();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<Id> id();

  Optional<Code> language();

  Optional<Period> period();

  Optional<Code> status();

  Optional<String> disposition();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<Identifier> paymentIdentifier();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<Reference> paymentIssuer();

  Optional<Reference> requestor();

  Optional<Date> paymentDate();

  Optional<List<PaymentReconciliation_Detail>> detail();

  static ImmutablePaymentReconciliation.PaymentAmountBuildStage builder() {
    return ImmutablePaymentReconciliation.builder();
  }
}
