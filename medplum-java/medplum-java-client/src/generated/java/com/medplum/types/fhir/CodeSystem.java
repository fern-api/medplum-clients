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
  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeSystem_Filter>> filter();

  Optional<String> version();

  Optional<Markdown> description();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<String> title();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<DateTime> date();

  Optional<String> publisher();

  Optional<Boolean> experimental();

  Optional<Boolean> caseSensitive();

  Optional<Boolean> versionNeeded();

  Optional<CodesystemHierarchymeaning> hierarchyMeaning();

  Optional<Markdown> copyright();

  Optional<List<ContactDetail>> contact();

  Optional<List<CodeSystem_Concept>> concept();

  Optional<Id> id();

  Optional<Markdown> purpose();

  Optional<CodesystemContent> content();

  Optional<List<Extension>> modifierExtension();

  Optional<UnsignedInt> count();

  Optional<Code> language();

  Optional<Boolean> compositional();

  Optional<List<UsageContext>> useContext();

  Optional<Canonical> supplements();

  Optional<Uri> url();

  Optional<String> name();

  Optional<List<CodeSystem_Property>> property();

  Optional<CodesystemStatus> status();

  Optional<Canonical> valueSet();

  static ImmutableCodeSystem.ResourceTypeBuildStage builder() {
    return ImmutableCodeSystem.builder();
  }
}
