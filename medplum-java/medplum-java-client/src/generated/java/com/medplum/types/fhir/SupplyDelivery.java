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
  Optional<List<Reference>> receiver();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<Period> occurrencePeriod();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> type();

  Optional<SupplydeliveryStatus> status();

  Optional<Reference> supplier();

  Optional<List<Reference>> basedOn();

  Optional<Timing> occurrenceTiming();

  Optional<List<Extension>> extension();

  Optional<Reference> destination();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> partOf();

  Optional<SupplyDelivery_SuppliedItem> suppliedItem();

  Optional<Meta> meta();

  Optional<Reference> patient();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  String resourceType();

  Optional<String> occurrenceDateTime();

  static ImmutableSupplyDelivery.ResourceTypeBuildStage builder() {
    return ImmutableSupplyDelivery.builder();
  }
}
