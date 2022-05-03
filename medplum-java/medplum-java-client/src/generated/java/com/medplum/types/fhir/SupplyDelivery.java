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
    as = ImmutableSupplyDelivery.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SupplyDelivery {
  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<SupplyDelivery_SuppliedItem> suppliedItem();

  Optional<Reference> destination();

  Optional<List<ResourceList>> contained();

  Optional<Reference> patient();

  String resourceType();

  Optional<List<Reference>> basedOn();

  Optional<List<Reference>> receiver();

  Optional<SupplydeliveryStatus> status();

  Optional<String> occurrenceDateTime();

  Optional<Timing> occurrenceTiming();

  Optional<Reference> supplier();

  Optional<Code> language();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> partOf();

  Optional<Period> occurrencePeriod();

  Optional<Uri> implicitRules();

  static ImmutableSupplyDelivery.ResourceTypeBuildStage builder() {
    return ImmutableSupplyDelivery.builder();
  }
}
