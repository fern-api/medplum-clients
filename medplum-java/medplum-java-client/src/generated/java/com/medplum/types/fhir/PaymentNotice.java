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

  Optional<Reference> response();

  Optional<Reference> provider();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<Id> id();

  Reference recipient();

  Optional<Reference> request();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Reference payment();

  Optional<Code> status();

  Optional<DateTime> created();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> payee();

  Optional<Meta> meta();

  Money amount();

  Optional<Narrative> text();

  Optional<Date> paymentDate();

  static ImmutablePaymentNotice.RecipientBuildStage builder() {
    return ImmutablePaymentNotice.builder();
  }
}
