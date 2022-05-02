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
  Optional<List<ContactPoint>> telecom();

  Optional<List<Reference>> endpoint();

  Optional<String> availabilityExceptions();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> id();

  Optional<List<CodeableConcept>> type();

  Optional<Meta> meta();

  Optional<Address> address();

  Optional<Coding> operationalStatus();

  Optional<CodeableConcept> physicalType();

  Optional<Location_Position> position();

  Optional<List<Location_HoursOfOperation>> hoursOfOperation();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<String> name();

  String resourceType();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<LocationStatus> status();

  Optional<List<Identifier>> identifier();

  Optional<Reference> managingOrganization();

  Optional<Narrative> text();

  Optional<Reference> partOf();

  Optional<Code> language();

  Optional<List<String>> alias();

  Optional<LocationMode> mode();

  static ImmutableLocation.ResourceTypeBuildStage builder() {
    return ImmutableLocation.builder();
  }
}
