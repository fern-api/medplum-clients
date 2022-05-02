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
  Optional<Code> status();

  Optional<PaymentreconciliationOutcome> outcome();

  Optional<Period> period();

  Optional<Reference> requestor();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> formCode();

  Optional<Date> paymentDate();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> paymentIdentifier();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> created();

  Money paymentAmount();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<List<PaymentReconciliation_ProcessNote>> processNote();

  String resourceType();

  Optional<Reference> request();

  Optional<List<PaymentReconciliation_Detail>> detail();

  Optional<Id> id();

  Optional<Reference> paymentIssuer();

  Optional<String> disposition();

  Optional<Code> language();

  Optional<Narrative> text();

  static ImmutablePaymentReconciliation.PaymentAmountBuildStage builder() {
    return ImmutablePaymentReconciliation.builder();
  }
}
