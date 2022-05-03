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
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Reference> requestor();

  String resourceType();

  Optional<DateTime> created();

  Optional<Code> status();

  Money paymentAmount();

  Optional<List<PaymentReconciliation_ProcessNote>> processNote();

  Optional<Identifier> paymentIdentifier();

  Optional<String> disposition();

  Optional<PaymentreconciliationOutcome> outcome();

  Optional<Reference> request();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<CodeableConcept> formCode();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Reference> paymentIssuer();

  Optional<List<PaymentReconciliation_Detail>> detail();

  Optional<List<ResourceList>> contained();

  Optional<Period> period();

  Optional<Date> paymentDate();

  Optional<Id> id();

  static ImmutablePaymentReconciliation.ResourceTypeBuildStage builder() {
    return ImmutablePaymentReconciliation.builder();
  }
}
