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
    as = ImmutableChargeItem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ChargeItem {
  Optional<uri> implicitRules();

  Optional<Reference> productReference();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<Quantity> quantity();

  Optional<String> occurrenceDateTime();

  Optional<Reference> performingOrganization();

  Optional<List<ChargeItem_Performer>> performer();

  Optional<Reference> requestingOrganization();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<List<Annotation>> note();

  Reference subject();

  Optional<ChargeitemStatus> status();

  Optional<List<CodeableConcept>> bodysite();

  Optional<List<Reference>> service();

  Optional<List<Reference>> partOf();

  Optional<List<Reference>> supportingInformation();

  String resourceType();

  Optional<List<CodeableConcept>> reason();

  Optional<Reference> enterer();

  Optional<CodeableConcept> productCodeableConcept();

  Optional<Timing> occurrenceTiming();

  Optional<Money> priceOverride();

  Optional<dateTime> enteredDate();

  Optional<List<uri>> definitionUri();

  Optional<String> overrideReason();

  Optional<code> language();

  Optional<List<Reference>> account();

  Optional<List<Extension>> extension();

  Optional<Reference> costCenter();

  CodeableConcept code();

  Optional<decimal> factorOverride();

  Optional<Reference> context();

  Optional<id> id();

  Optional<Period> occurrencePeriod();

  Optional<List<canonical>> definitionCanonical();

  static ImmutableChargeItem.SubjectBuildStage builder() {
    return ImmutableChargeItem.builder();
  }
}
