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
  Optional<List<ContactDetail>> contact();

  Optional<Canonical> baseDefinition();

  Optional<String> version();

  Optional<StructureDefinition_Snapshot> snapshot();

  Optional<Id> id();

  Optional<List<Coding>> keyword();

  Optional<List<UsageContext>> useContext();

  Optional<Markdown> description();

  Optional<StructuredefinitionKind> kind();

  Optional<Uri> url();

  Optional<Markdown> copyright();

  Optional<Uri> type();

  Optional<StructuredefinitionFhirversion> fhirVersion();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<StructuredefinitionStatus> status();

  Optional<DateTime> date();

  String resourceType();

  Optional<List<StructureDefinition_Mapping>> mapping();

  Optional<StructuredefinitionDerivation> derivation();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<StructureDefinition_Differential> differential();

  Optional<Uri> implicitRules();

  Optional<List<StructureDefinition_Context>> context();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  @JsonProperty("abstract")
  Optional<Boolean> _abstract();

  Optional<Boolean> experimental();

  Optional<String> title();

  Optional<String> publisher();

  Optional<List<String>> contextInvariant();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> purpose();

  static ImmutableStructureDefinition.ResourceTypeBuildStage builder() {
    return ImmutableStructureDefinition.builder();
  }
}
