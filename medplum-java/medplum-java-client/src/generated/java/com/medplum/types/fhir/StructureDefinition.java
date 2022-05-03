package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    as = ImmutableStructureDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureDefinition {
  Optional<Markdown> description();

  Optional<Markdown> purpose();

  Optional<StructuredefinitionFhirversion> fhirVersion();

  Optional<String> version();

  Optional<StructureDefinition_Snapshot> snapshot();

  Optional<List<ContactDetail>> contact();

  Optional<List<Coding>> keyword();

  Optional<String> publisher();

  Optional<String> name();

  Optional<Uri> type();

  Optional<DateTime> date();

  Optional<List<Identifier>> identifier();

  Optional<StructuredefinitionKind> kind();

  Optional<Canonical> baseDefinition();

  Optional<List<String>> contextInvariant();

  Optional<Boolean> experimental();

  String resourceType();

  Optional<StructureDefinition_Differential> differential();

  Optional<Id> id();

  Optional<Uri> url();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Narrative> text();

  Optional<List<UsageContext>> useContext();

  Optional<List<StructureDefinition_Context>> context();

  @JsonProperty("abstract")
  Optional<Boolean> _abstract();

  Optional<List<Extension>> extension();

  Optional<String> title();

  Optional<StructuredefinitionStatus> status();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<StructuredefinitionDerivation> derivation();

  Optional<Uri> implicitRules();

  Optional<Markdown> copyright();

  Optional<List<ResourceList>> contained();

  Optional<List<StructureDefinition_Mapping>> mapping();

  static ImmutableStructureDefinition.ResourceTypeBuildStage builder() {
    return ImmutableStructureDefinition.builder();
  }
}
