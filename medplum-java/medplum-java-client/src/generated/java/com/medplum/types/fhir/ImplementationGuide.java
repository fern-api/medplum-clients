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
    as = ImmutableImplementationGuide.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide {
  Optional<Id> id();

  Optional<Narrative> text();

  Optional<DateTime> date();

  Optional<List<Extension>> modifierExtension();

  Optional<List<UsageContext>> useContext();

  Optional<Uri> url();

  Optional<String> title();

  Optional<ImplementationguideLicense> license();

  Optional<List<ImplementationGuide_DependsOn>> dependsOn();

  Optional<String> publisher();

  Optional<List<ImplementationGuide_Global>> global();

  Optional<Meta> meta();

  Optional<Boolean> experimental();

  Optional<List<ContactDetail>> contact();

  Optional<ImplementationGuide_Definition> definition();

  Optional<ImplementationguideStatus> status();

  Optional<List<Extension>> extension();

  Optional<Markdown> copyright();

  Optional<List<ResourceList>> contained();

  Optional<String> version();

  Optional<String> name();

  Optional<ImplementationGuide_Manifest> manifest();

  String resourceType();

  Optional<Markdown> description();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Id> packageId();

  Optional<List<ImplementationguideFhirversionItem>> fhirVersion();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  static ImmutableImplementationGuide.ResourceTypeBuildStage builder() {
    return ImmutableImplementationGuide.builder();
  }
}
