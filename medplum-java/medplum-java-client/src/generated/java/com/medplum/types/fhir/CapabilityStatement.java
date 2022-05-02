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
  Optional<List<CapabilityStatement_Messaging>> messaging();

  Optional<CapabilityStatement_Implementation> implementation();

  Optional<List<UsageContext>> useContext();

  Optional<List<CapabilityStatement_Rest>> rest();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<CapabilitystatementKind> kind();

  Optional<List<CapabilityStatement_Document>> document();

  Optional<CapabilitystatementStatus> status();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Canonical>> implementationGuide();

  Optional<CapabilityStatement_Software> software();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> date();

  Optional<List<Code>> patchFormat();

  Optional<List<ContactDetail>> contact();

  Optional<CapabilitystatementFhirversion> fhirVersion();

  Optional<String> title();

  Optional<Markdown> copyright();

  Optional<List<Canonical>> instantiates();

  Optional<Markdown> description();

  Optional<String> publisher();

  Optional<List<Code>> format();

  String resourceType();

  Optional<Boolean> experimental();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<String> name();

  Optional<Uri> url();

  Optional<Markdown> purpose();

  Optional<String> version();

  Optional<List<Canonical>> imports();

  static ImmutableCapabilityStatement.ResourceTypeBuildStage builder() {
    return ImmutableCapabilityStatement.builder();
  }
}
