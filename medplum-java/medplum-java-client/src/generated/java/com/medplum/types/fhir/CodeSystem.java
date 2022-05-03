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
    as = ImmutableCodeSystem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CodeSystem {
  Optional<Code> language();

  Optional<CodesystemHierarchymeaning> hierarchyMeaning();

  Optional<UnsignedInt> count();

  Optional<List<CodeSystem_Concept>> concept();

  String resourceType();

  Optional<Boolean> compositional();

  Optional<Uri> implicitRules();

  Optional<List<CodeSystem_Filter>> filter();

  Optional<Canonical> valueSet();

  Optional<Id> id();

  Optional<String> name();

  Optional<List<UsageContext>> useContext();

  Optional<List<Extension>> modifierExtension();

  Optional<String> version();

  Optional<CodesystemStatus> status();

  Optional<Markdown> purpose();

  Optional<Markdown> copyright();

  Optional<List<ContactDetail>> contact();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<CodesystemContent> content();

  Optional<DateTime> date();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeSystem_Property>> property();

  Optional<Meta> meta();

  Optional<Markdown> description();

  Optional<Boolean> caseSensitive();

  Optional<String> publisher();

  Optional<String> title();

  Optional<Boolean> versionNeeded();

  Optional<Canonical> supplements();

  Optional<Uri> url();

  Optional<Boolean> experimental();

  static ImmutableCodeSystem.ResourceTypeBuildStage builder() {
    return ImmutableCodeSystem.builder();
  }
}
