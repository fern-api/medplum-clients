package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCapabilityStatement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement {
  Optional<String> publisher();

  Optional<Narrative> text();

  Optional<dateTime> date();

  Optional<List<CapabilityStatement_Document>> document();

  Optional<Boolean> experimental();

  Optional<CapabilitystatementKind> kind();

  Optional<code> language();

  Optional<List<ResourceList>> contained();

  Optional<markdown> copyright();

  Optional<List<code>> format();

  Optional<List<canonical>> instantiates();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<uri> url();

  Optional<CapabilitystatementFhirversion> fhirVersion();

  Optional<CapabilityStatement_Implementation> implementation();

  Optional<List<code>> patchFormat();

  Optional<List<canonical>> imports();

  Optional<Meta> meta();

  Optional<List<CapabilityStatement_Messaging>> messaging();

  Optional<String> name();

  Optional<uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<CapabilitystatementStatus> status();

  Optional<String> title();

  Optional<List<ContactDetail>> contact();

  Optional<CapabilityStatement_Software> software();

  String resourceType();

  Optional<markdown> description();

  Optional<List<UsageContext>> useContext();

  Optional<List<canonical>> implementationGuide();

  Optional<id> id();

  Optional<String> version();

  Optional<List<Extension>> modifierExtension();

  Optional<markdown> purpose();

  Optional<List<CapabilityStatement_Rest>> rest();

  static ImmutableCapabilityStatement.ResourceTypeBuildStage builder() {
    return ImmutableCapabilityStatement.builder();
  }
}
