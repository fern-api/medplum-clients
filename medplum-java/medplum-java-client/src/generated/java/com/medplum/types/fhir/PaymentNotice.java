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
    as = ImmutablePaymentNotice.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PaymentNotice {
  Optional<CodeableConcept> paymentStatus();

  Optional<Reference> payee();

  Optional<DateTime> created();

  Optional<Uri> implicitRules();

  Optional<Date> paymentDate();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> response();

  Optional<Id> id();

  Optional<Reference> request();

  Optional<List<Extension>> extension();

  Optional<Code> status();

  Optional<List<Identifier>> identifier();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  String resourceType();

  Reference recipient();

  Money amount();

  Optional<Reference> provider();

  Reference payment();

  static ImmutablePaymentNotice.ResourceTypeBuildStage builder() {
    return ImmutablePaymentNotice.builder();
  }
}
