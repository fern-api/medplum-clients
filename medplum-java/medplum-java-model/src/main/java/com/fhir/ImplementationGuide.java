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
    as = ImmutableImplementationGuide.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide {
  Optional<List<ImplementationGuide_DependsOn>> dependsOn();

  Optional<uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<List<ImplementationGuide_Global>> global();

  String resourceType();

  Optional<markdown> description();

  Optional<uri> url();

  Optional<String> version();

  Optional<markdown> copyright();

  Optional<code> language();

  Optional<String> title();

  Optional<List<ImplementationguideFhirversionItem>> fhirVersion();

  Optional<ImplementationGuide_Definition> definition();

  Optional<id> id();

  Optional<dateTime> date();

  Optional<ImplementationguideLicense> license();

  Optional<List<ContactDetail>> contact();

  Optional<List<UsageContext>> useContext();

  Optional<List<Extension>> extension();

  Optional<ImplementationGuide_Manifest> manifest();

  Optional<String> name();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> publisher();

  Optional<List<Extension>> modifierExtension();

  Optional<ImplementationguideStatus> status();

  Optional<id> packageId();

  Optional<Meta> meta();

  Optional<Boolean> experimental();

  static ImmutableImplementationGuide.ResourceTypeBuildStage builder() {
    return ImmutableImplementationGuide.builder();
  }
}
