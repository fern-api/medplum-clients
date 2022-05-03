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
    as = ImmutableNamingSystem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NamingSystem {
  Optional<Code> language();

  Optional<List<UsageContext>> useContext();

  Optional<CodeableConcept> type();

  Optional<Markdown> description();

  Optional<String> responsible();

  Optional<List<ContactDetail>> contact();

  Optional<String> usage();

  Optional<List<Extension>> modifierExtension();

  Optional<NamingsystemStatus> status();

  Optional<String> name();

  String resourceType();

  Optional<Meta> meta();

  Optional<NamingsystemKind> kind();

  Optional<DateTime> date();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<String> publisher();

  Optional<Uri> implicitRules();

  List<NamingSystem_UniqueId> uniqueId();

  static ImmutableNamingSystem.ResourceTypeBuildStage builder() {
    return ImmutableNamingSystem.builder();
  }
}
