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
  Optional<String> title();

  String resourceType();

  Optional<Markdown> description();

  Optional<Boolean> versionNeeded();

  Optional<List<ContactDetail>> contact();

  Optional<Narrative> text();

  Optional<CodesystemStatus> status();

  Optional<Boolean> compositional();

  Optional<CodesystemHierarchymeaning> hierarchyMeaning();

  Optional<Code> language();

  Optional<Markdown> copyright();

  Optional<List<CodeSystem_Filter>> filter();

  Optional<CodesystemContent> content();

  Optional<UnsignedInt> count();

  Optional<List<CodeSystem_Property>> property();

  Optional<String> publisher();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<List<CodeSystem_Concept>> concept();

  Optional<Id> id();

  Optional<DateTime> date();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Boolean> experimental();

  Optional<Canonical> valueSet();

  Optional<List<Identifier>> identifier();

  Optional<String> version();

  Optional<List<ResourceList>> contained();

  Optional<Markdown> purpose();

  Optional<Uri> implicitRules();

  Optional<List<UsageContext>> useContext();

  Optional<String> name();

  Optional<Boolean> caseSensitive();

  Optional<Uri> url();

  Optional<Canonical> supplements();

  Optional<List<Extension>> extension();

  static ImmutableCodeSystem.ResourceTypeBuildStage builder() {
    return ImmutableCodeSystem.builder();
  }
}
