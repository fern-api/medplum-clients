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
    as = ImmutablePaymentNotice.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PaymentNotice {
  Optional<code> status();

  String resourceType();

  Optional<Meta> meta();

  Optional<Reference> provider();

  Reference payment();

  Optional<Reference> payee();

  Optional<Reference> response();

  Optional<id> id();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> paymentStatus();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<dateTime> created();

  Optional<List<Identifier>> identifier();

  Optional<date> paymentDate();

  Optional<Reference> request();

  Reference recipient();

  Money amount();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> implicitRules();

  Optional<code> language();

  static ImmutablePaymentNotice.ResourceTypeBuildStage builder() {
    return ImmutablePaymentNotice.builder();
  }
}
