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
  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<CodeableConcept> physicalType();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<LocationStatus> status();

  Optional<String> description();

  Optional<Reference> partOf();

  Optional<String> availabilityExceptions();

  Optional<LocationMode> mode();

  Optional<List<ContactPoint>> telecom();

  Optional<Coding> operationalStatus();

  Optional<Location_Position> position();

  Optional<Meta> meta();

  Optional<String> name();

  Optional<List<String>> alias();

  Optional<Address> address();

  Optional<List<CodeableConcept>> type();

  Optional<Reference> managingOrganization();

  Optional<Id> id();

  Optional<List<Reference>> endpoint();

  Optional<List<Extension>> extension();

  Optional<List<Location_HoursOfOperation>> hoursOfOperation();

  static ImmutableLocation.ResourceTypeBuildStage builder() {
    return ImmutableLocation.builder();
  }
}
