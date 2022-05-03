package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<CapabilityStatement_Software> software();

  Optional<String> title();

  Optional<List<CapabilityStatement_Document>> document();

  Optional<Uri> url();

  Optional<CapabilitystatementStatus> status();

  Optional<List<CapabilityStatement_Messaging>> messaging();

  Optional<String> version();

  Optional<Markdown> copyright();

  Optional<List<Extension>> extension();

  Optional<String> publisher();

  Optional<List<Canonical>> implementationGuide();

  Optional<Id> id();

  Optional<List<Canonical>> imports();

  Optional<CapabilitystatementFhirversion> fhirVersion();

  Optional<DateTime> date();

  Optional<Markdown> description();

  Optional<Code> language();

  Optional<Markdown> purpose();

  Optional<List<CapabilityStatement_Rest>> rest();

  Optional<Uri> implicitRules();

  Optional<List<UsageContext>> useContext();

  Optional<List<Canonical>> instantiates();

  String resourceType();

  Optional<Meta> meta();

  Optional<List<Code>> format();

  Optional<Boolean> experimental();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ResourceList>> contained();

  Optional<CapabilitystatementKind> kind();

  Optional<List<ContactDetail>> contact();

  Optional<CapabilityStatement_Implementation> implementation();

  Optional<List<Code>> patchFormat();

  Optional<String> name();

  static ImmutableCapabilityStatement.ResourceTypeBuildStage builder() {
    return ImmutableCapabilityStatement.builder();
  }
}
