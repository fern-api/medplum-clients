package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link VerificationResult_Validator}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVerificationResult_Validator.builder()}.
 */
@Generated(from = "VerificationResult_Validator", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableVerificationResult_Validator
    implements VerificationResult_Validator {
  private final Reference organization;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable String identityCertificate;
  private final @Nullable Signature attestationSignature;

  private ImmutableVerificationResult_Validator(
      Reference organization,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable String identityCertificate,
      @Nullable Signature attestationSignature) {
    this.organization = organization;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.id = id;
    this.identityCertificate = identityCertificate;
    this.attestationSignature = attestationSignature;
  }

  /**
   * @return The value of the {@code organization} attribute
   */
  @JsonProperty("organization")
  @Override
  public Reference organization() {
    return organization;
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code identityCertificate} attribute
   */
  @JsonProperty("identityCertificate")
  @Override
  public Optional<String> identityCertificate() {
    return Optional.ofNullable(identityCertificate);
  }

  /**
   * @return The value of the {@code attestationSignature} attribute
   */
  @JsonProperty("attestationSignature")
  @Override
  public Optional<Signature> attestationSignature() {
    return Optional.ofNullable(attestationSignature);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link VerificationResult_Validator#organization() organization} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for organization
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVerificationResult_Validator withOrganization(Reference value) {
    if (this.organization == value) return this;
    Reference newValue = Objects.requireNonNull(value, "organization");
    return new ImmutableVerificationResult_Validator(
        newValue,
        this.modifierExtension,
        this.extension,
        this.id,
        this.identityCertificate,
        this.attestationSignature);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Validator#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Validator withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableVerificationResult_Validator(
        this.organization,
        newValue,
        this.extension,
        this.id,
        this.identityCertificate,
        this.attestationSignature);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Validator#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Validator withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableVerificationResult_Validator(
        this.organization,
        value,
        this.extension,
        this.id,
        this.identityCertificate,
        this.attestationSignature);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Validator#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Validator withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableVerificationResult_Validator(
        this.organization,
        this.modifierExtension,
        newValue,
        this.id,
        this.identityCertificate,
        this.attestationSignature);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Validator#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Validator withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableVerificationResult_Validator(
        this.organization,
        this.modifierExtension,
        value,
        this.id,
        this.identityCertificate,
        this.attestationSignature);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Validator#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Validator withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableVerificationResult_Validator(
        this.organization,
        this.modifierExtension,
        this.extension,
        newValue,
        this.identityCertificate,
        this.attestationSignature);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Validator#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Validator withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableVerificationResult_Validator(
        this.organization,
        this.modifierExtension,
        this.extension,
        value,
        this.identityCertificate,
        this.attestationSignature);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Validator#identityCertificate() identityCertificate} attribute.
   * @param value The value for identityCertificate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Validator withIdentityCertificate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "identityCertificate");
    if (Objects.equals(this.identityCertificate, newValue)) return this;
    return new ImmutableVerificationResult_Validator(
        this.organization,
        this.modifierExtension,
        this.extension,
        this.id,
        newValue,
        this.attestationSignature);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Validator#identityCertificate() identityCertificate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identityCertificate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Validator withIdentityCertificate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.identityCertificate, value)) return this;
    return new ImmutableVerificationResult_Validator(
        this.organization,
        this.modifierExtension,
        this.extension,
        this.id,
        value,
        this.attestationSignature);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Validator#attestationSignature() attestationSignature} attribute.
   * @param value The value for attestationSignature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Validator withAttestationSignature(Signature value) {
    @Nullable Signature newValue = Objects.requireNonNull(value, "attestationSignature");
    if (this.attestationSignature == newValue) return this;
    return new ImmutableVerificationResult_Validator(
        this.organization,
        this.modifierExtension,
        this.extension,
        this.id,
        this.identityCertificate,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Validator#attestationSignature() attestationSignature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for attestationSignature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Validator withAttestationSignature(Optional<? extends Signature> optional) {
    @Nullable Signature value = optional.orElse(null);
    if (this.attestationSignature == value) return this;
    return new ImmutableVerificationResult_Validator(
        this.organization,
        this.modifierExtension,
        this.extension,
        this.id,
        this.identityCertificate,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVerificationResult_Validator} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVerificationResult_Validator
        && equalTo((ImmutableVerificationResult_Validator) another);
  }

  private boolean equalTo(ImmutableVerificationResult_Validator another) {
    return organization.equals(another.organization)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(identityCertificate, another.identityCertificate)
        && Objects.equals(attestationSignature, another.attestationSignature);
  }

  /**
   * Computes a hash code from attributes: {@code organization}, {@code modifierExtension}, {@code extension}, {@code id}, {@code identityCertificate}, {@code attestationSignature}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + organization.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(identityCertificate);
    h += (h << 5) + Objects.hashCode(attestationSignature);
    return h;
  }

  /**
   * Prints the immutable value {@code VerificationResult_Validator} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("VerificationResult_Validator{");
    builder.append("organization=").append(organization);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (identityCertificate != null) {
      builder.append(", ");
      builder.append("identityCertificate=").append(identityCertificate);
    }
    if (attestationSignature != null) {
      builder.append(", ");
      builder.append("attestationSignature=").append(attestationSignature);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "VerificationResult_Validator", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements VerificationResult_Validator {
    @Nullable Reference organization;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> identityCertificate = Optional.empty();
    boolean identityCertificateIsSet;
    @Nullable Optional<Signature> attestationSignature = Optional.empty();
    boolean attestationSignatureIsSet;
    @JsonProperty("organization")
    public void setOrganization(Reference organization) {
      this.organization = organization;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("identityCertificate")
    public void setIdentityCertificate(Optional<String> identityCertificate) {
      this.identityCertificate = identityCertificate;
      this.identityCertificateIsSet = true;
    }
    @JsonProperty("attestationSignature")
    public void setAttestationSignature(Optional<Signature> attestationSignature) {
      this.attestationSignature = attestationSignature;
      this.attestationSignatureIsSet = true;
    }
    @Override
    public Reference organization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> identityCertificate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Signature> attestationSignature() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableVerificationResult_Validator fromJson(Json json) {
    ImmutableVerificationResult_Validator.Builder builder = ((ImmutableVerificationResult_Validator.Builder) ImmutableVerificationResult_Validator.builder());
    if (json.organization != null) {
      builder.organization(json.organization);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identityCertificateIsSet) {
      builder.identityCertificate(json.identityCertificate);
    }
    if (json.attestationSignatureIsSet) {
      builder.attestationSignature(json.attestationSignature);
    }
    return (ImmutableVerificationResult_Validator) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link VerificationResult_Validator} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable VerificationResult_Validator instance
   */
  public static VerificationResult_Validator copyOf(VerificationResult_Validator instance) {
    if (instance instanceof ImmutableVerificationResult_Validator) {
      return (ImmutableVerificationResult_Validator) instance;
    }
    return ((ImmutableVerificationResult_Validator.Builder) ImmutableVerificationResult_Validator.builder())
        .organization(instance.organization())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .id(instance.id())
        .identityCertificate(instance.identityCertificate())
        .attestationSignature(instance.attestationSignature())
        .build();
  }

  /**
   * Creates a builder for {@link VerificationResult_Validator VerificationResult_Validator}.
   * <pre>
   * ImmutableVerificationResult_Validator.builder()
   *    .organization(com.medplum.types.fhir.Reference) // required {@link VerificationResult_Validator#organization() organization}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link VerificationResult_Validator#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link VerificationResult_Validator#extension() extension}
   *    .id(String) // optional {@link VerificationResult_Validator#id() id}
   *    .identityCertificate(String) // optional {@link VerificationResult_Validator#identityCertificate() identityCertificate}
   *    .attestationSignature(com.medplum.types.fhir.Signature) // optional {@link VerificationResult_Validator#attestationSignature() attestationSignature}
   *    .build();
   * </pre>
   * @return A new VerificationResult_Validator builder
   */
  public static OrganizationBuildStage builder() {
    return new ImmutableVerificationResult_Validator.Builder();
  }

  /**
   * Builds instances of type {@link VerificationResult_Validator VerificationResult_Validator}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "VerificationResult_Validator", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements OrganizationBuildStage, BuildFinal {
    private static final long INIT_BIT_ORGANIZATION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_IDENTITY_CERTIFICATE = 0x8L;
    private static final long OPT_BIT_ATTESTATION_SIGNATURE = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Reference organization;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable String identityCertificate;
    private @Nullable Signature attestationSignature;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link VerificationResult_Validator#organization() organization} attribute.
     * @param organization The value for organization 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organization")
    public final Builder organization(Reference organization) {
      checkNotIsSet(organizationIsSet(), "organization");
      this.organization = Objects.requireNonNull(organization, "organization");
      initBits &= ~INIT_BIT_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Validator#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Validator#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Validator#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Validator#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Validator#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Validator#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Validator#identityCertificate() identityCertificate} to identityCertificate.
     * @param identityCertificate The value for identityCertificate
     * @return {@code this} builder for chained invocation
     */
    public final Builder identityCertificate(String identityCertificate) {
      checkNotIsSet(identityCertificateIsSet(), "identityCertificate");
      this.identityCertificate = Objects.requireNonNull(identityCertificate, "identityCertificate");
      optBits |= OPT_BIT_IDENTITY_CERTIFICATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Validator#identityCertificate() identityCertificate} to identityCertificate.
     * @param identityCertificate The value for identityCertificate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identityCertificate")
    public final Builder identityCertificate(Optional<String> identityCertificate) {
      checkNotIsSet(identityCertificateIsSet(), "identityCertificate");
      this.identityCertificate = identityCertificate.orElse(null);
      optBits |= OPT_BIT_IDENTITY_CERTIFICATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Validator#attestationSignature() attestationSignature} to attestationSignature.
     * @param attestationSignature The value for attestationSignature
     * @return {@code this} builder for chained invocation
     */
    public final Builder attestationSignature(Signature attestationSignature) {
      checkNotIsSet(attestationSignatureIsSet(), "attestationSignature");
      this.attestationSignature = Objects.requireNonNull(attestationSignature, "attestationSignature");
      optBits |= OPT_BIT_ATTESTATION_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Validator#attestationSignature() attestationSignature} to attestationSignature.
     * @param attestationSignature The value for attestationSignature
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("attestationSignature")
    public final Builder attestationSignature(Optional<? extends Signature> attestationSignature) {
      checkNotIsSet(attestationSignatureIsSet(), "attestationSignature");
      this.attestationSignature = attestationSignature.orElse(null);
      optBits |= OPT_BIT_ATTESTATION_SIGNATURE;
      return this;
    }

    /**
     * Builds a new {@link VerificationResult_Validator VerificationResult_Validator}.
     * @return An immutable instance of VerificationResult_Validator
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public VerificationResult_Validator build() {
      checkRequiredAttributes();
      return new ImmutableVerificationResult_Validator(organization, modifierExtension, extension, id, identityCertificate, attestationSignature);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identityCertificateIsSet() {
      return (optBits & OPT_BIT_IDENTITY_CERTIFICATE) != 0;
    }

    private boolean attestationSignatureIsSet() {
      return (optBits & OPT_BIT_ATTESTATION_SIGNATURE) != 0;
    }

    private boolean organizationIsSet() {
      return (initBits & INIT_BIT_ORGANIZATION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of VerificationResult_Validator is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!organizationIsSet()) attributes.add("organization");
      return "Cannot build VerificationResult_Validator, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "VerificationResult_Validator", generator = "Immutables")
  public interface OrganizationBuildStage {
    /**
     * Initializes the value for the {@link VerificationResult_Validator#organization() organization} attribute.
     * @param organization The value for organization 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organization(Reference organization);
  }

  @Generated(from = "VerificationResult_Validator", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link VerificationResult_Validator#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link VerificationResult_Validator#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link VerificationResult_Validator#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link VerificationResult_Validator#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link VerificationResult_Validator#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link VerificationResult_Validator#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link VerificationResult_Validator#identityCertificate() identityCertificate} to identityCertificate.
     * @param identityCertificate The value for identityCertificate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identityCertificate(String identityCertificate);

    /**
     * Initializes the optional value {@link VerificationResult_Validator#identityCertificate() identityCertificate} to identityCertificate.
     * @param identityCertificate The value for identityCertificate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identityCertificate(Optional<String> identityCertificate);

    /**
     * Initializes the optional value {@link VerificationResult_Validator#attestationSignature() attestationSignature} to attestationSignature.
     * @param attestationSignature The value for attestationSignature
     * @return {@code this} builder for chained invocation
     */
    BuildFinal attestationSignature(Signature attestationSignature);

    /**
     * Initializes the optional value {@link VerificationResult_Validator#attestationSignature() attestationSignature} to attestationSignature.
     * @param attestationSignature The value for attestationSignature
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal attestationSignature(Optional<? extends Signature> attestationSignature);

    /**
     * Builds a new {@link VerificationResult_Validator VerificationResult_Validator}.
     * @return An immutable instance of VerificationResult_Validator
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    VerificationResult_Validator build();
  }
}
