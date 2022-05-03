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
  Money amount();

  Optional<Reference> response();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<CodeableConcept> paymentStatus();

  Optional<Meta> meta();

  Optional<Code> status();

  Optional<Narrative> text();

  Optional<Reference> provider();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<Reference> request();

  Optional<DateTime> created();

  Optional<Id> id();

  Optional<Reference> payee();

  Optional<List<Identifier>> identifier();

  Reference recipient();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<Date> paymentDate();

  Reference payment();

  static ImmutablePaymentNotice.AmountBuildStage builder() {
    return ImmutablePaymentNotice.builder();
  }
}
