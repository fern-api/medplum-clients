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
    as = ImmutableLocation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Location {
  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Reference> managingOrganization();

  Optional<List<Extension>> extension();

  Optional<LocationStatus> status();

  Optional<Location_Position> position();

  Optional<List<Reference>> endpoint();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<LocationMode> mode();

  Optional<List<CodeableConcept>> type();

  Optional<Address> address();

  Optional<List<Location_HoursOfOperation>> hoursOfOperation();

  Optional<Code> language();

  Optional<CodeableConcept> physicalType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> alias();

  Optional<String> availabilityExceptions();

  String resourceType();

  Optional<Reference> partOf();

  Optional<Meta> meta();

  Optional<String> description();

  Optional<List<ContactPoint>> telecom();

  Optional<List<ResourceList>> contained();

  Optional<String> name();

  Optional<Coding> operationalStatus();

  static ImmutableLocation.ResourceTypeBuildStage builder() {
    return ImmutableLocation.builder();
  }
}
