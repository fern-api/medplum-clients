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
  Optional<Reference> request();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<Reference> provider();

  Optional<Reference> payee();

  Optional<Date> paymentDate();

  Optional<CodeableConcept> paymentStatus();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<Code> status();

  Optional<Reference> response();

  String resourceType();

  Money amount();

  Optional<DateTime> created();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Reference recipient();

  Reference payment();

  Optional<Id> id();

  static ImmutablePaymentNotice.ResourceTypeBuildStage builder() {
    return ImmutablePaymentNotice.builder();
  }
}
