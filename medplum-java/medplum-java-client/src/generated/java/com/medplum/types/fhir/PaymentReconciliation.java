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
  Optional<Narrative> text();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<Reference> requestor();

  Optional<List<PaymentReconciliation_ProcessNote>> processNote();

  Optional<Reference> paymentIssuer();

  Optional<Identifier> paymentIdentifier();

  Optional<PaymentreconciliationOutcome> outcome();

  Optional<List<Identifier>> identifier();

  Optional<List<PaymentReconciliation_Detail>> detail();

  Optional<Date> paymentDate();

  Optional<List<ResourceList>> contained();

  Optional<String> disposition();

  Optional<CodeableConcept> formCode();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> created();

  String resourceType();

  Optional<Period> period();

  Optional<Code> status();

  Optional<Reference> request();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Money paymentAmount();

  static ImmutablePaymentReconciliation.ResourceTypeBuildStage builder() {
    return ImmutablePaymentReconciliation.builder();
  }
}
