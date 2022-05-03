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
  Optional<CodeableConcept> type();

  Optional<Timing> occurrenceTiming();

  Optional<Reference> patient();

  String resourceType();

  Optional<List<Reference>> basedOn();

  Optional<List<Identifier>> identifier();

  Optional<Reference> destination();

  Optional<SupplydeliveryStatus> status();

  Optional<Code> language();

  Optional<List<Reference>> receiver();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> partOf();

  Optional<SupplyDelivery_SuppliedItem> suppliedItem();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<String> occurrenceDateTime();

  Optional<Period> occurrencePeriod();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> supplier();

  static ImmutableSupplyDelivery.ResourceTypeBuildStage builder() {
    return ImmutableSupplyDelivery.builder();
  }
}
